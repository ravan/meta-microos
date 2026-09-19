SUMMARY = "Lookup error codes and their description"
DESCRIPTION = "This command searches for error codes for errno, libeconf, and pam and displays the name of the error, its value, and its description. \
Additionally, it is possible to search for words in the error description. \
This can even be done for all language environments."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0+git20260325.4cbfc70"

RPM_NAME = "error-codes-0.4.0+git20260325.4cbfc70-1.4.aarch64.rpm"
RPM_HASH = "540bf5edfe2908ca3eea23738549ce5cb6b0eb955d0aaa2976e053f8567316f5a12b0fcb4e671fc07550f311517e6779a677cab3b7a0644b91e72e3213a8c238"

RPROVIDES:${PN} += "error-codes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libeconf.so.0 \
libpam.so.0"

inherit rpm
