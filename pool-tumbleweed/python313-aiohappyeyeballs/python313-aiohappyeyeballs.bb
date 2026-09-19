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

RPM_NAME = "python313-aiohappyeyeballs-2.7.1-1.1.noarch.rpm"
RPM_HASH = "209b26260933a3bdef6df7b8a01e0341d47ca14c03bbfc1595000d07b6ba199f18b944a003cbece15cfa04a16a93459d90d71ae57779ec8b8a8166e8866b24ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohappyeyeballs \
python3.13dist-aiohappyeyeballs \
python313-aiohappyeyeballs \
python3dist-aiohappyeyeballs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
