SUMMARY = "Scripts to convert xml to man pages or html"
DESCRIPTION = "xmltoman and xmlmantohtml are two very simple scripts for converting xml \
to groff or html."
LICENSE = "GPL-2.0-only"

PV = "0.4"

RPM_NAME = "xmltoman-0.4-2.17.noarch.rpm"
RPM_HASH = "3b4ef30bee2664c83e10bc7c3dd0de1da053d7499eb2e0b92c414d532faea9a46ced54643581daf6106f99b63eae59e85e4fb54051a9d0d42e474736a1c96b78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmltoman"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-XML--Parser"

inherit rpm
