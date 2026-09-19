SUMMARY = "Window Manager Icons, themable icon distribution"
DESCRIPTION = "The Window Manager Icons is an efficient icon distribution designed to \
be standardized and configurable.  Includes several themed icon sets, \
scripts, and configurations for several window managers. \
 \
 \
 \
Authors: \
-------- \
    Mikhael Goikhman <migo@homemail.com> \
    Olivier Chapuis <olivier.chapuis@free.fr>"
LICENSE = "GPL-2.0+"

PV = "0.4.0"

RPM_NAME = "wm-icons-0.4.0-17.25.noarch.rpm"
RPM_HASH = "d4496b1df4a40939926b97a5f099df7181c9bb066778e6833527667430f34e471af98aed5fa29d44dd131ecb5d1da6b34fbfa90c0486a47709d219cb7ffd3e52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wm-icons"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
