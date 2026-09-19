SUMMARY = "Perl extension for simple genrating of unique id's"
DESCRIPTION = "Data::Uniqid provides three simple routines for generating unique ids. \
These ids are coded with a Base62 systen to make them short and handy (e.g. \
to use it as part of a URL). \
 \
  suinqid \
    genrates a very short id valid only for the localhost and with a \
    liftime of 1 day \
 \
  uniqid \
    generates a short id valid on the local host \
 \
  luniqid \
    generates a long id valid everywhere and ever"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.12"

RPM_NAME = "perl-Data-Uniqid-0.12-1.39.noarch.rpm"
RPM_HASH = "f90b66340341beef435b6c4cd48f6437e23b4cd02cbbcd813b4852cd0b3aa2eb877cfaf4065143753604bc49d96d4b5b099e6f9e6d8f7ed8a2f612c0026a8841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Uniqid \
perl-Data-Uniqid"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
