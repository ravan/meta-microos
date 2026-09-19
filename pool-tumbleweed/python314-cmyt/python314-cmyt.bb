SUMMARY = "A collection of Matplotlib colormaps from the yt project"
DESCRIPTION = "Matplotlib colormaps from the yt project !"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python314-cmyt-2.0.2-1.3.noarch.rpm"
RPM_HASH = "76e9b0157fa494e0ec2665d3b401677626fdfebec7fcdd90df6f49cca2521023717cafc425fb7cfbf83046c1093b24a3744ce5c0ebcfd8a4bee6438dfe2faf63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cmyt \
python314-cmyt \
python3dist-cmyt"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-numpy"

inherit rpm
