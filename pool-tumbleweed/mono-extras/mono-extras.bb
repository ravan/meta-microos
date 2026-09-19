SUMMARY = "Extra packages"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Extra packages."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "mono-extras-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "9cf0d8bfc0de0c95a6c19552b7490f986ff2b080ea1bb393f65c004b4b2d43579aa38cd6f6f78cd3fec5ea452c972d49ed991e51549faa7669fde567909df8fe"

RPROVIDES:${PN} += "mono-Mono.Messaging \
mono-Mono.Messaging.RabbitMQ \
mono-RabbitMQ.Client \
mono-RabbitMQ.Client.Apigen \
mono-System.Configuration.Install \
mono-System.Management \
mono-System.Messaging \
mono-System.Runtime.Caching \
mono-System.ServiceProcess \
mono-System.ServiceProcess.ServiceController \
mono-System.Xaml \
mono-extras \
mono-installutil \
mono-mono-service \
mono-ms-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
mono-Mono.Posix \
mono-System \
mono-System.Configuration \
mono-System.Core \
mono-System.Data \
mono-System.Drawing \
mono-System.Windows.Forms \
mono-System.Xml \
mono-core \
mono-mscorlib"

inherit rpm
