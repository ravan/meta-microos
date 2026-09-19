SUMMARY = "Ordered Multivalue Dictionary"
DESCRIPTION = "Ordered Multivalue Dictionary - omdict."
LICENSE = "Unlicense"

PV = "1.0.2"

RPM_NAME = "python313-orderedmultidict-1.0.2-1.3.noarch.rpm"
RPM_HASH = "25765ccc64a55bed3855d4979bfb0c0988eeea34e95bab1db328d9e337a3c894b7a26c18031f36ea15752e2b0585613c1cc9c5f22f605374147ec27699439485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-orderedmultidict \
python3.13dist-orderedmultidict \
python313-orderedmultidict \
python3dist-orderedmultidict"

RDEPENDS:${PN} += "python-abi \
python313-six"

inherit rpm
