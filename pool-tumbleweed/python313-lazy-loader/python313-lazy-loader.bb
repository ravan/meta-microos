SUMMARY = "Populate library namespace without incurring immediate import costs"
DESCRIPTION = "lazy_loader makes it easy to load subpackages and functions on demand. \
  1. Allow subpackages to be made visible to users without incurring import costs. \
  2. Allow external libraries to be imported only when used, improving import times."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "python313-lazy-loader-0.5-1.3.noarch.rpm"
RPM_HASH = "45620cecb009b8650244775bcbfa3e57d5b789cebb6c79d52c4e2c392a46752a538ea7860e6251c610ec4a27569b14d54c748da9ef00bfb6f747a25a8b042af0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazy-loader \
python3.13dist-lazy-loader \
python313-lazy-loader \
python3dist-lazy-loader"

RDEPENDS:${PN} += "python-abi"

inherit rpm
