SUMMARY = "Collect instance metadata in EC2"
DESCRIPTION = "Collect instance meta data in Amazon Compute CLoud instances"
LICENSE = "GPL-3.0-or-later"

PV = "5.0.0"

RPM_NAME = "python-ec2metadata-5.0.0-2.4.noarch.rpm"
RPM_HASH = "c561a3afeac543ca597634ebc51347114ef6868f7312d200dd396b3a2d1741d847ae547b7fc9b37af6771e6c6b83e8a446c50c7f05ba260d46f1e7a692812b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ec2metadata \
python3.13dist-ec2metadata \
python3dist-ec2metadata"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
