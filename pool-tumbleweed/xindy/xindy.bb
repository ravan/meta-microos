SUMMARY = "Index generator for structured documents like LaTeX or SGML"
DESCRIPTION = "xindy is an index processor that can be used to generate book-like \
indexes for arbitrary document-preparation systems. This includes \
systems such as TeX and LaTeX, the roff-family, SGML/XML-based \
systems (e.g. HTML) that process some kind of text and generate \
indexing information. The kernel system is not fixed to any specific \
system, but can be configured to work together with such systems. \
 \
In comparison to other index processors xindy has several powerful \
features that make it an ideal framework for describing and \
generating complex indices, addressing especially international \
indexing."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.1"

RPM_NAME = "xindy-2.5.1-3.13.aarch64.rpm"
RPM_HASH = "055d7f35d01de81e7f1778265aa945776aaf919942d9c8493817b3691cd40e87259f07bf44848c099b435ff7a9e3408e8ea00f1de9c5fa56bb631c0db1b0a7df"

RPROVIDES:${PN} += "xindy \
xindy-doc"

RDEPENDS:${PN} += "/usr/bin/env \
clisp \
libc.so.6 \
xindy-rules"

inherit rpm
