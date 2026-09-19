SUMMARY = "Proxy client for the anonymous proxy system JonDonym"
DESCRIPTION = "JonDo is the local proxy client for JonDonym anonymous webservice. \
JonDonym (the name is derived from John Doe and Anonymous) protects your \
privacy on the Internet and makes truely anonymous using of webservices \
possible. You may use JonDo like a proxy for different web applications. \
For anonymous web surfing we hardly recommend Firefox or Iceweasel \
together with the JonDoFox profile."
LICENSE = "BSD-3-Clause"

PV = "00.20.001"

RPM_NAME = "jondo-00.20.001-2.9.noarch.rpm"
RPM_HASH = "93656ba54f32cacb85b42d03f426dbdcd9619c1e13adbea0bed4df219496ab7b541168e83c215c4b55300e4f7a2a2817ef8386481b3653e3ee24ff7d3bd0cccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jondo"

RDEPENDS:${PN} += "/usr/bin/sh \
jre"

inherit rpm
