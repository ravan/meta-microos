SUMMARY = "Kernel.org Uploader - client"
DESCRIPTION = "Kup is a file upload utility for kernel.org. It is designed to only accept \
cryptographically verified uploads from pre-authorized, trusted members."
LICENSE = "GPL-2.0+"

PV = "0.3.6"

RPM_NAME = "kup-client-0.3.6-1.22.aarch64.rpm"
RPM_HASH = "78c660ce03608b46e98a1cd0a14b05ce4acfe8268bcc6c14101277fcceb3e8bb44926c76a0fbe4d524a541434d43cf56067496a3288b5ee6479e2b237c2a090c"

RPROVIDES:${PN} += "kup-client"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Config--Simple \
perl-Encode \
perl-File--Spec"

inherit rpm
