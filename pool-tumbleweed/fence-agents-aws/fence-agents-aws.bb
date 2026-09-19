SUMMARY = "Fence agent for Amazon AWS"
DESCRIPTION = "Fence agent for Amazon AWS instances."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-aws-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "132366129d09e751277a4d3c3edf7f44e777bb24fad4b8fcc36fbd3bfeb06d9b40879b788d8035b6eeb76607ca40b3d91d36d9e7f34883c3f0164f0aef368290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-aws"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common \
python3-boto3 \
python3-botocore"

inherit rpm
