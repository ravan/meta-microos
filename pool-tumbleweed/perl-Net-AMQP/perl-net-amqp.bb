SUMMARY = "Advanced Message Queue Protocol (de)serialization and representation"
DESCRIPTION = "This module implements the frame (de)serialization and representation of \
the Advanced Message Queue Protocol (http://www.amqp.org/). It is to be \
used in conjunction with client or server software that does the actual \
TCP/IP communication."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-Net-AMQP-0.06-1.35.noarch.rpm"
RPM_HASH = "341e84285a389e73ba0dddaf30c1e6c442905ee26ff4bc7136bb543e53e01d6ba656603d2e20365cae7de2c4b3f66ad186f90eb9f009ae7246f6ffe470b7f40a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--AMQP \
perl-Net--AMQP--Common \
perl-Net--AMQP--Frame \
perl-Net--AMQP--Frame--Body \
perl-Net--AMQP--Frame--Header \
perl-Net--AMQP--Frame--Heartbeat \
perl-Net--AMQP--Frame--Method \
perl-Net--AMQP--Frame--OOBBody \
perl-Net--AMQP--Frame--OOBHeader \
perl-Net--AMQP--Frame--OOBMethod \
perl-Net--AMQP--Frame--Trace \
perl-Net--AMQP--Protocol \
perl-Net--AMQP--Protocol--Base \
perl-Net--AMQP--Protocol--v0-8 \
perl-Net--AMQP--Value \
perl-Net--AMQP--Value--Boolean \
perl-Net--AMQP--Value--Integer \
perl-Net--AMQP--Value--String \
perl-Net--AMQP--Value--Timestamp \
perl-Net-AMQP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Class--Accessor \
perl-Class--Data--Inheritable \
perl-XML--LibXML"

inherit rpm
