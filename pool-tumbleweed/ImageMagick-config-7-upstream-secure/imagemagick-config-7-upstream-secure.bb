SUMMARY = "Secure ImageMagick Security Policy"
DESCRIPTION = "This stringent security policy prioritizes the implementation of \
rigorous controls and restricted resource utilization to establish a \
profoundly secure setting while employing ImageMagick. It deactivates \
conceivably hazardous functionalities, including specific coders like \
SVG or HTTP. The policy promotes the tailoring of security measures to \
harmonize with the requirements of the local environment and the guidelines \
of the organization. This protocol encompasses explicit particulars like \
limitations on memory consumption, sanctioned pathways for reading and \
writing, confines on image sequences, the utmost permissible duration of \
workflows, allocation of disk space intended for image data, and even an \
undisclosed passphrase for remote connections. By adopting this robust \
policy, entities can elevate their overall security stance and alleviate \
potential vulnerabilities."
LICENSE = "ImageMagick"

PV = "7.1.2.30"

RPM_NAME = "ImageMagick-config-7-upstream-secure-7.1.2.30-1.1.noarch.rpm"
RPM_HASH = "ed5d2190c1a112296077247d63593d7f505593faf1be4f025b40c271fdbd507f689cb54d4d2fe0b74f2995b50f077ec59cd959d6e956c9c2c6850a3270a3d0c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ImageMagick-config-7-upstream-secure \
config-ImageMagick-config-7-upstream-secure \
imagick-config-7"

RDEPENDS:${PN} += ""

inherit rpm
