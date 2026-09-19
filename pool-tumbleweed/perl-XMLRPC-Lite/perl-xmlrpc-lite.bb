SUMMARY = "client and server implementation of XML-RPC protocol"
DESCRIPTION = "XMLRPC::Lite is a Perl modules which provides a simple nterface to the \
XML-RPC protocol both on client and server side. Based on SOAP::Lite \
module, it gives you access to all features and transports available in \
that module. \
 \
See _t/26-xmlrpc.t_ for client examples and _examples/XMLRPC/*_ for server \
implementations."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.717"

RPM_NAME = "perl-XMLRPC-Lite-0.717-1.36.noarch.rpm"
RPM_HASH = "8720912e8cef38e577a629d7e65072b17f04bcca8e597d493c8755422b1c69077d1a3a4aaf82e8746a78aababc5d2a5d52bff7beeeaba67317a4fe59d4f2a039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Apache--XMLRPC--Lite \
perl-My--PingPong \
perl-XMLRPC \
perl-XMLRPC--Constants \
perl-XMLRPC--Data \
perl-XMLRPC--Deserializer \
perl-XMLRPC--Lite \
perl-XMLRPC--SOM \
perl-XMLRPC--Serializer \
perl-XMLRPC--Server \
perl-XMLRPC--Server--Parameters \
perl-XMLRPC--Test \
perl-XMLRPC--Test--Server \
perl-XMLRPC--Transport--HTTP \
perl-XMLRPC--Transport--HTTP--Apache \
perl-XMLRPC--Transport--HTTP--CGI \
perl-XMLRPC--Transport--HTTP--Daemon \
perl-XMLRPC--Transport--POP3 \
perl-XMLRPC--Transport--POP3--Server \
perl-XMLRPC--Transport--TCP \
perl-XMLRPC--Transport--TCP--Server \
perl-XMLRPC-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-SOAP--Lite \
perl-SOAP--Transport--TCP"

inherit rpm
