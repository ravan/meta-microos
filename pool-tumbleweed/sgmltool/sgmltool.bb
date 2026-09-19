SUMMARY = "SGML-Tools - a Text-Formatting Package"
DESCRIPTION = "SGML-Tools is a text-formatting package based on SGML (Standard \
Generalized Markup Language), which allows you to produce LaTeX, HTML, \
GNU info, LyX, RTF, and plain ASCII documents (via groff) from a single \
source. \
 \
This system is tailored for writing technical software documentation, \
an example of which is the Linux HOWTO documents. It should be useful \
for all kinds of printed and online documentation. \
 \
This package is the successor to the Linuxdoc package. \
 \
SGML-Tools cannot process arbitrary SGML documents. In such a case, try \
jade_dsl and write your own DSSSL scripts (take the docbk30 package as \
an example)."
LICENSE = "SUSE-Public-Domain"

PV = "1.0.9"

RPM_NAME = "sgmltool-1.0.9-1080.8.aarch64.rpm"
RPM_HASH = "494bc2c73f17fd895c88726f0832e5996ed0db66465debfdff4bc94dfe898597cdbe724567d7843ff80a4512c3ec34f1e95c92f99714c6a3707f31d554859491"

RPROVIDES:${PN} += "perl-SGMLTools \
perl-SGMLTools--BackEnd \
perl-SGMLTools--CharEnts \
perl-SGMLTools--FixRef \
perl-SGMLTools--Html2Html \
perl-SGMLTools--Lang \
perl-SGMLTools--Utils \
perl-SGMLTools--Vars \
perl-Text--EntityMap \
perl-Text--EntityMapGroup \
sgml-tools \
sgmltool"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfl.so.2 \
opensp \
perl"

inherit rpm
