SUMMARY = "Shell-like regular expressions"
DESCRIPTION = "Provides shell-like regular expressions.  The wildcards provided are ?, \
* and **, where ** is like * but matches /.  See compile_shellish for \
details. \
 \
 \
 \
Authors: \
-------- \
    Barrie Slaymaker <barries at slaysys dot com>"
LICENSE = "Artistic-1.0"

PV = "0.93"

RPM_NAME = "perl-Regexp-Shellish-0.93-164.46.aarch64.rpm"
RPM_HASH = "852ceab9268c8a6c4104ef6523cdf205aba44442199aa578db666c9b43157a0071355a1367e5e13f4e449cd80394e69b0c7e4531f6a9c5b7bccfdd66d8ed5c1e"

RPROVIDES:${PN} += "perl-Regexp--Shellish \
perl-Regexp-Shellish"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
