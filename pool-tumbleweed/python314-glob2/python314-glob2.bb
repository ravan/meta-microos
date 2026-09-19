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

RPM_NAME = "python314-glob2-0.7-3.9.noarch.rpm"
RPM_HASH = "e30fd5fcda842cfc5a3119a2de8001c2427a2cb38033da1fedc17242942756dd6483c793835e57932199bdbbe3661deec7921ef73cd24b858d70dfed1eb9b806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-glob2 \
python314-glob2 \
python3dist-glob2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
