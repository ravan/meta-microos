SUMMARY = "League Of Movable Type's 'Junction' font"
DESCRIPTION = "Junction is a a humanist sans-serif, and the first open-source type project started by The League of Moveable Type."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-junction-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "bcb2fb9ea3f36946d8fa7b0f5cccdea0fe197c922e09ffa3d77e4dbbf0c69ca5bd172824c08465ad7e9181f72ae77f3673f98de86fb5304507461692a76c33ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-junction-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
