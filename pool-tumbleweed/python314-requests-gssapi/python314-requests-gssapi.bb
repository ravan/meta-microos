SUMMARY = "A GSSAPI authentication handler for python-requests"
DESCRIPTION = "A GSSAPI authentication handler for python-requests"
LICENSE = "ISC"

PV = "1.4.0"

RPM_NAME = "python314-requests-gssapi-1.4.0-1.4.noarch.rpm"
RPM_HASH = "f471101d1f0ae7e7d8031a3bd7f669f7e3919a70ae06579cc4dffe4b81519877d773f0217c08e6c868f074e55c8cae44beab513f448a4810727cb1178a1b10f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requests-gssapi \
python314-requests-gssapi \
python3dist-requests-gssapi"

RDEPENDS:${PN} += "python-abi \
python314-gssapi \
python314-requests"

inherit rpm
