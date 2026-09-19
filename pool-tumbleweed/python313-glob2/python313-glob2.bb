SUMMARY = "Glob module recursive wildcards support"
DESCRIPTION = "This module provides an extended version of Python's builtin glob \
module with the following additions: \
 \
- The ability to capture the text matched by glob patterns, and \
  return those matches alongside the filenames. \
- A recursive '**' globbing syntax, akin for example to the globstar \
  option of the bash shell. \
- The ability to replace the filesystem functions used, in order to \
  glob on virtual filesystems."
LICENSE = "BSD-2-Clause"

PV = "0.7"

RPM_NAME = "python313-glob2-0.7-3.9.noarch.rpm"
RPM_HASH = "13cd057bb86b3aa36e0c9793ff5813ddb149431867e5634cfe9a9df353bd2f4a9f7e1788ee107d40ac1a9fc4a09297e2f7c5b5fc04bd0f9d51fbdc290db9d5aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glob2 \
python3.13dist-glob2 \
python313-glob2 \
python3dist-glob2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
