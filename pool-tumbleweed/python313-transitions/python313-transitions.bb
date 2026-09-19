SUMMARY = "A lightweight, object-oriented Python state machine implementation"
DESCRIPTION = "The transitions package makes it convenient and relatively easy to define and \
implement FSMs (finite state machines) in python."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python313-transitions-0.9.3-1.2.noarch.rpm"
RPM_HASH = "85613adec0a18f5cadb56091add60678d74e9d14d88816cf55fffafc976cdce22b3344cda4a5357c23e386b616d08bf0b6d4e884182127db0b413e229661f4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-transitions \
python3.13dist-transitions \
python313-transitions \
python3dist-transitions"

RDEPENDS:${PN} += "python-abi \
python313-six"

inherit rpm
