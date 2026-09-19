SUMMARY = "Happy Eyeballs for asyncio"
DESCRIPTION = "This library exists to allow connecting with Happy Eyeballs (RFC 8305) when \
you already have a list of addrinfo and not a DNS name. \
 \
The stdlib version of `loop.create_connection()` \
will only work when you pass in an unresolved name which \
is not a good fit when using DNS caching or resolving \
names via another method such was `zeroconf`."
LICENSE = "Python-2.0"

PV = "2.7.1"

RPM_NAME = "python314-aiohappyeyeballs-2.7.1-1.1.noarch.rpm"
RPM_HASH = "1a53788da9a3f565d20751a526eb3d2a5ef1c2e4cd4e9262ccf88776142c3de42a96e084532b3dd42324b3f9e3dadc4cc78a61650b1b1330fa59352f0c3bd152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiohappyeyeballs \
python314-aiohappyeyeballs \
python3dist-aiohappyeyeballs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
