SUMMARY = "Most advanced XSS scanner"
DESCRIPTION = " \
XSStrike is a Cross Site Scripting detection suite equipped with four hand \
written parsers, an intelligent payload generator, a powerful fuzzing engine \
and an incredibly fast crawler. \
 \
Instead of injecting payloads and checking it works like all the other tools \
do, XSStrike analyses the response with multiple parsers and then crafts \
payloads that are guaranteed to work by context analysis integrated with a \
fuzzing engine."
LICENSE = "GPL-3.0-only"

PV = "3.1.5"

RPM_NAME = "XSStrike-3.1.5-2.9.noarch.rpm"
RPM_HASH = "7a1fc9df9e6222abd4b88636d81d63884706db699f916897c1a154e79029b7c8b77b940d4b39a0b2bc77539504bf78fd0f27365f098db2c67a00722a1315b6bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "XSStrike"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-fuzzywuzzy"

inherit rpm
