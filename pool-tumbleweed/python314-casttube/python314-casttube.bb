SUMMARY = "YouTube chromecast api"
DESCRIPTION = "casttube provides a way to interact with the Youtube Chromecast api."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python314-casttube-0.2.1-3.5.noarch.rpm"
RPM_HASH = "1025b3f15435020a104b6d5052d183f980d1bbe3e2b51014cf42822cd6bd86812912a5f4fdd0acddc40e1d5428134699d027c311f837ddbdce9c67da154b70bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-casttube \
python314-casttube \
python3dist-casttube"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
