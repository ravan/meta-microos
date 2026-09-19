SUMMARY = "The universal package manager library"
DESCRIPTION = "Often, scripts need to install system dependencies using the native package \
manager of the user's OS. Typically, this is solved by having some bash script \
that runs apt-get, assuming the user is on Ubuntu. Smarter scripts use hand \
crafted code to detect the user's platform and aggregate a set of dependencies \
on a few of the more popular platforms. Our approach is different: \
  * Parse package format (devel/debug/normal library or executable) \
  * Look up package managers that exist in PATH \
  * Format parsed package with common package convention of package manager \
 \
More on https://github.com/MycroftAI/pako"
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "python313-pako-0.3.1-3.5.noarch.rpm"
RPM_HASH = "5b2d0fb03db1852b743dfc417e24e1c1ab845888a6021183783625b5361400515b4c24b55ac6c84456dbb90395598306024ec50a377968f278c075fda4af4b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pako \
python3.13dist-pako \
python313-pako \
python3dist-pako"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-appdirs"

inherit rpm
