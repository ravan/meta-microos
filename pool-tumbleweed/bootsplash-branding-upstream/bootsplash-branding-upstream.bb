SUMMARY = "Unbranded Bootsplash Theme"
DESCRIPTION = "This package contains a theme without trademarked logos."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "bootsplash-branding-upstream-3.3-13.23.noarch.rpm"
RPM_HASH = "49a33d5d6319e612ad7b6ade936f86e0761661ee1bd126c655f579d4280a9c4121e1bb5772534ed0bd3e0c9cabfd5eb56a92006af2558296ae14baeee75b6a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bootsplash-branding \
bootsplash-branding-upstream \
config-bootsplash-branding-upstream"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
bootsplash \
fillup \
perl"

inherit rpm
