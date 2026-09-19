SUMMARY = "Plugin for writing RESTful apps with Dancer2"
DESCRIPTION = "This plugin helps you write a RESTful webservice with Dancer2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.30.0"

RPM_NAME = "perl-Dancer2-Plugin-REST-1.30.0-1.3.noarch.rpm"
RPM_HASH = "f343b313451bc3ac2d9fe68222c678e1c3ab6e14dd826a35e5b18d72d3aa4ea7deaa3ec3290a267b8cbb66ebed36e55b9002b871133ee380d165ecff5c7394d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--REST \
perl-Dancer2-Plugin-REST"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Dancer2 \
perl-Dancer2--Core--HTTP \
perl-Dancer2--Plugin \
perl-Dancer2--Serializer--Mutable \
perl-Moo"

inherit rpm
