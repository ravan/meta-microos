SUMMARY = "Library for Working with GIF Images - Files Mandatory for Development"
DESCRIPTION = "This Library allows manipulating GIF Image files. Since the LZW patents \
have expired, giflib can again be used instead of libungif."
LICENSE = "MIT"

PV = "5.2.2"

RPM_NAME = "giflib-devel-5.2.2-4.3.aarch64.rpm"
RPM_HASH = "742c1ace29cb9e52d675ea66fd8c3742a19f4902cef5ff94549d309617b27272a4f6f02114385006f4b3f29792c886ee61fbe059a9b30e65534809e776cb1da9"

RPROVIDES:${PN} += "giflib-devel"

RDEPENDS:${PN} += "libgif7"

inherit rpm
