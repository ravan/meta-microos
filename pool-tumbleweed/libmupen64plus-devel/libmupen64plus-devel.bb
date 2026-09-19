SUMMARY = "Include Files for Mupen64plus Development"
DESCRIPTION = "This package contains all necessary include files to develop frontends against \
the Mupen64plus shared library interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.0"

RPM_NAME = "libmupen64plus-devel-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "0faef69af7b745381abbd7c3825437f25fcda732a17472bc2de8a5091ea693badbd2d52a6a5d5629f4436416bd1efd951edd1ef18a368451a2e8519db20ad698"

RPROVIDES:${PN} += "libmupen64plus-devel"

RDEPENDS:${PN} += "libmupen64plus2"

inherit rpm
