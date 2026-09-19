SUMMARY = "Python - JSON-Patches"
DESCRIPTION = "Python module to apply JSON-Patches (according to RFC 6902)."
LICENSE = "BSD-3-Clause"

PV = "1.33"

RPM_NAME = "python314-jsonpatch-1.33-2.5.noarch.rpm"
RPM_HASH = "33743199a84fe5f7c3cef41c5cc646929867376435d7507e7631e93397ccebe189d24fa561018442e53d0d708db8a7181a69506c704912aee825441cf594faa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonpatch \
python314-jsonpatch \
python3dist-jsonpatch"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-jsonpointer"

inherit rpm
