SUMMARY = "Decode uu/xx/b64/mime/yenc/etc-encoded data from a massive number of files"
DESCRIPTION = "This module started as an interface to the uulib/uudeview library by Frank \
Pilhofer that can be used to decode all kinds of usenet (and other) binary \
messages. \
 \
After upstream abondoned the project, th library was continuously bugfixed \
and improved in this module, with major focuses on security fixes, \
correctness and speed (that does not mean that this library is considered \
safe with untrusted data, but it surely is safer than the poriginal \
uudeview). \
 \
Read the file doc/library.pdf from the distribution for in-depth \
information about the C-library used in this interface, and the rest of \
this document and especially the non-trivial decoder program at the end."
LICENSE = "GPL-1.0-or-later"

PV = "1.800.0"

RPM_NAME = "perl-Convert-UUlib-1.800.0-2.8.aarch64.rpm"
RPM_HASH = "d2ec66fd32f5864369919e3640d2a42395cc4bcaf09ff0f8fa6d5aa2b0fcd703012baa53a4a280786bb8d38fabafa074f4cc213bdebe59c0798b407ad5135f6f"

RPROVIDES:${PN} += "p-conulb \
perl-Convert--UUlib \
perl-Convert-UUlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-common--sense"

inherit rpm
