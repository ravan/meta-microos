SUMMARY = "Perl bindings to the Thrift software framework"
DESCRIPTION = "Perl bindings to the Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "perl-thrift-0.24.0-2.1.noarch.rpm"
RPM_HASH = "294ae4cea7c735f8a5ed7d6743d3b0430e4f04f8494918aa80ba801c1fb672de0ab89abe4e168e12f6c7ad6f9edc1945e0c39cd9e06bbdb7e83ae92fc1a2c2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Thrift \
perl-Thrift--BinaryProtocol \
perl-Thrift--BinaryProtocolFactory \
perl-Thrift--BufferedTransport \
perl-Thrift--BufferedTransportFactory \
perl-Thrift--ForkingServer \
perl-Thrift--FramedTransport \
perl-Thrift--FramedTransportFactory \
perl-Thrift--HttpClient \
perl-Thrift--MemoryBuffer \
perl-Thrift--MultiplexedProcessor \
perl-Thrift--MultiplexedProtocol \
perl-Thrift--Protocol \
perl-Thrift--ProtocolDecorator \
perl-Thrift--SSLServerSocket \
perl-Thrift--SSLSocket \
perl-Thrift--Server \
perl-Thrift--ServerSocket \
perl-Thrift--ServerTransport \
perl-Thrift--SimpleServer \
perl-Thrift--Socket \
perl-Thrift--StoredMessageProtocol \
perl-Thrift--TApplicationException \
perl-Thrift--TException \
perl-Thrift--TMessageType \
perl-Thrift--TProtocolException \
perl-Thrift--TProtocolFactory \
perl-Thrift--TTransportException \
perl-Thrift--TType \
perl-Thrift--Transport \
perl-Thrift--TransportFactory \
perl-Thrift--UnixServerSocket \
perl-Thrift--UnixSocket \
perl-thrift"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Bit--Vector"

inherit rpm
