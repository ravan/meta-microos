SUMMARY = "Hawk Access Authentication protocol"
DESCRIPTION = "hawkauthlib is a low-level library for implementing Hawk Access Authentication, a \
simple HTTP request-signing scheme described in:https://npmjs.org/package/hawk"
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python313-hawkauthlib-2.0.0-6.11.noarch.rpm"
RPM_HASH = "d6b04c5b798c199fca59eacca4ed1495d00d8577bbc8a626dde0b96a3d6409e1b651a929634d6e94256b89c1181a7f5c0fb24077ab7c562c44bc64516513382c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hawkauthlib \
python3.13dist-hawkauthlib \
python313-hawkauthlib \
python3dist-hawkauthlib"

RDEPENDS:${PN} += "python-abi \
python313-WebOb"

inherit rpm
