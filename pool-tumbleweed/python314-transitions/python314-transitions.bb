SUMMARY = "A lightweight, object-oriented Python state machine implementation"
DESCRIPTION = "The transitions package makes it convenient and relatively easy to define and \
implement FSMs (finite state machines) in python."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python314-transitions-0.9.3-1.2.noarch.rpm"
RPM_HASH = "ea6a68c2d734550785a1b7df442ceb273cb13d5e5b4f3dc16097afe54657da7b0608d7585190b831a0dda51e3915dcf1fd8fcb43236344d90fa6ee7366a67602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-transitions \
python314-transitions \
python3dist-transitions"

RDEPENDS:${PN} += "python-abi \
python314-six"

inherit rpm
