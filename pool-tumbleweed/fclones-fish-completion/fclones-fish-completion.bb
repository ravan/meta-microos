SUMMARY = "Fish Completion for fclones"
DESCRIPTION = "Fish command line completion support for fclones, generated during the build."
LICENSE = "MIT"

PV = "0.35.0"

RPM_NAME = "fclones-fish-completion-0.35.0-2.5.noarch.rpm"
RPM_HASH = "7ec26a58af4a6f4b4469cc74917e5594c6da0ba6f63550f1b508817e7a46ce2828cd0ac335ddeaae5d4c7bad7d3af631aa3466e4564729cb99f91e31a21de650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fclones-fish-completion"

RDEPENDS:${PN} += "fclones"

inherit rpm
