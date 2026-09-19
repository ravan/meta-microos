SUMMARY = "Image management utilities for AWS EC2"
DESCRIPTION = "A collection of image manipulation utilities for AWS EC2. These include: \
- ec2deprecateimg: Deprecates images by applying tags per convention \
- ec2publishimg: Set image visibility \
- ec2uploadimg: Upload an image to AWS EC2"
LICENSE = "GPL-3.0-or-later"

PV = "10.0.5"

RPM_NAME = "python-ec2imgutils-10.0.5-1.2.noarch.rpm"
RPM_HASH = "2e3c7a58f05a5910befbb4db1e980c1b0710b7d223c2035195adffc7d19023f7c58757eaa3c19c20e9899031da5f57918e05e37101fd36db8f367639a2188676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ec2deprecateimg-/usr/bin/ec2deprecateimg \
python-ec2imgutils \
python-ec2publishimg-/usr/bin/ec2publishimg \
python-ec2uploadimg-/usr/bin/ec2uploadimg \
python-ec2utilsbase-/usr/lib/python2.7/site-packages/ec2utils \
python3-ec2deprecateimg-/usr/bin/ec2deprecateimg \
python3-ec2publishimg-/usr/bin/ec2publishimg \
python3-ec2uploadimg-/usr/bin/ec2uploadimg \
python3-ec2utilsbase \
python3.13dist-ec2imgutils \
python3dist-ec2imgutils"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python313-boto3 \
python313-dateutil \
python313-paramiko \
update-alternatives"

inherit rpm
