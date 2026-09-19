SUMMARY = "Limited ImageMagick Security Policy"
DESCRIPTION = "The primary objective of the limited security policy is to find a \
middle ground between convenience and security. This policy involves the \
deactivation of potentially hazardous functionalities, like specific coders \
such as SVG or HTTP. Furthermore, it establishes several constraints on \
the utilization of resources like memory, storage, and processing duration, \
all of which are adjustable. This policy proves advantageous in situations \
where there's a need to mitigate the potential threat of handling possibly \
malicious or demanding images, all while retaining essential capabilities \
for prevalent image formats."
LICENSE = "ImageMagick"

PV = "7.1.2.30"

RPM_NAME = "ImageMagick-config-7-upstream-limited-7.1.2.30-1.1.noarch.rpm"
RPM_HASH = "34a953804cd62efc440516f7f590ebe6bc99eb8532f297e7611c4a08e3d19c6ef364f7f9550fb3de98d1b4edfbbf91a64038fbedc82b2404eff5b459cd4ddf17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ImageMagick-config-7-upstream-limited \
config-ImageMagick-config-7-upstream-limited \
imagick-config-7"

RDEPENDS:${PN} += ""

inherit rpm
