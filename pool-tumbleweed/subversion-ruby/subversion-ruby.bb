SUMMARY = "Allows Ruby scripts to directly use Subversion repositories"
DESCRIPTION = "Provides Ruby (SWIG) support for Subversion version control system."
LICENSE = "Apache-2.0"

PV = "1.14.5"

RPM_NAME = "subversion-ruby-1.14.5-5.3.aarch64.rpm"
RPM_HASH = "259cbe1083fe9d4ffc51c7301b3cec07d4f9caa4dfe6381c6b52e6f81ed82c9fc053ccbf171291300158ec2a34cef9a206e20afeecfc2fc04f97fffac6e696ac"

RPROVIDES:${PN} += "libsvn-swig-ruby-1.so.0 \
subversion-ruby"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libm.so.6 \
libruby4.0.so.4.0 \
libsvn-client-1.so.0 \
libsvn-delta-1.so.0 \
libsvn-diff-1.so.0 \
libsvn-fs-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-repos-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
subversion"

inherit rpm
