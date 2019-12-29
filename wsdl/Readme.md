# Connections between soap components


Service --------> Binding

service.port.@binding 		<---------> 	binding.@name

Binding --------> portType

binding.@type 				<---------> 	portType.@name

binding.operation.@name 	<--------->		portType.operation.@name

portType --------> message

portType.operation.input.@message 	<--->	message.@name

portType.operation.output.@message 	<--->	message.@name

message ---------> types

message.part.@element 		<--------->		element.@name

-------------------------------------------------------------------------

# Connections between soap namespaces

types ----------> definition

schema.@targetNamespace <--------> schema.@xmlns
