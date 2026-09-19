SUMMARY = "Web-safe ImageMagick Security Policy"
DESCRIPTION = "This security protocol designed for web-safe usage focuses on situations \
where ImageMagick is applied in publicly accessible contexts, like websites. \
It deactivates the capability to read from or write to any image formats \
other than web-safe formats like GIF, JPEG, and PNG. Additionally, this \
policy prohibits the execution of image filters and indirect reads, thereby \
thwarting potential security breaches. By implementing these limitations, \
the web-safe policy fortifies the safeguarding of systems accessible to \
the public, reducing the risk of exploiting ImageMagick's capabilities \
for potential attacks."
LICENSE = "ImageMagick"

PV = "7.1.2.30"

RPM_NAME = "ImageMagick-config-7-upstream-websafe-7.1.2.30-1.1.noarch.rpm"
RPM_HASH = "d0df89e42f2e3ff07ca2fe66721c40ed5358f8bedd2f8864bd45c7bb8a01adf38707a0dad542eabf6bd18dc2704a65b497a0114dec37e713cefbf8cc537e70ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ImageMagick-config-7-upstream-websafe \
config-ImageMagick-config-7-upstream-websafe \
imagick-config-7"

RDEPENDS:${PN} += ""

inherit rpm
