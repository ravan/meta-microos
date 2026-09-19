SUMMARY = "Patched dd with Computer Forensics Features"
DESCRIPTION = "dc3dd is a patched version of GNU dd to include a number of features useful \
for computer forensics. Many of these features were inspired by dcfldd, but \
were rewritten for dc3dd. \
 \
* Pattern writes. The program can write a single hexadecimal value or a text \
  string to the output device for wiping purposes. \
* Piecewise and overall hashing with multiple algorithms and variable size \
  windows. Supports MD5, SHA-1, SHA-256, and SHA-512. Hashes can be computed \
  before or after conversions are made. \
* Progress meter with automatic input/output file size probing \
* Combined log for hashes and errors \
* Error grouping. Produces one error message for identical sequential errors \
* Verify mode. Able to repeat any transformations done to the input file and \
  compare it to an output. \
* Ability to split the output into chunks with numerical or alphabetic \
  extensions"
LICENSE = "GPL-3.0-only"

PV = "7.3.1"

RPM_NAME = "dc3dd-7.3.1-3.6.aarch64.rpm"
RPM_HASH = "41ac263d94baa2b71ad805f3aaad9b1535e268300fe24f93c0a2b72b148e4af0ff78af80e80c03f81cd5ac182288e89c95297355cb7e057afefd580791740217"

RPROVIDES:${PN} += "dc3dd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
