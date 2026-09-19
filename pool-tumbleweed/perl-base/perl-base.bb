SUMMARY = "The Perl interpreter"
DESCRIPTION = "perl - Practical Extraction and Report Language \
 \
Perl is optimized for scanning arbitrary text files, extracting \
information from those text files, and printing reports based on that \
information.  It is also good for many system management tasks. \
 \
Perl is intended to be practical (easy to use, efficient, and complete) \
rather than beautiful (tiny, elegant, and minimal). \
 \
This package contains only some basic modules and the perl binary \
itself."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.44.0"

RPM_NAME = "perl-base-5.44.0-1.2.aarch64.rpm"
RPM_HASH = "420331ad615bae6aca0fbf4abce5c2d96b45ee8c52856323057260b90b87ee04085236392f693a02885e8e16e85e68c6d353fef33f6108c50a47aa13347c23ec"

RPROVIDES:${PN} += "perl-AutoLoader \
perl-B \
perl-B--Deparse \
perl-B--OBJECT \
perl-Carp \
perl-Carp--Heavy \
perl-Class--Struct \
perl-Class--Struct--Tie-ISA \
perl-Config \
perl-Config--Extensions \
perl-Config--Perl--V \
perl-Cwd \
perl-DB \
perl-Data--Dumper \
perl-Digest \
perl-Digest--MD5 \
perl-Digest--SHA \
perl-Digest--base \
perl-Digest--file \
perl-Digest-MD5 \
perl-DynaLoader \
perl-English \
perl-Errno \
perl-Exporter \
perl-Exporter--Heavy \
perl-Fcntl \
perl-File--Basename \
perl-File--Compare \
perl-File--Copy \
perl-File--DosGlob \
perl-File--Fetch \
perl-File--Find \
perl-File--Glob \
perl-File--GlobMapper \
perl-File--Path \
perl-File--Spec \
perl-File--Spec--AmigaOS \
perl-File--Spec--Cygwin \
perl-File--Spec--Epoc \
perl-File--Spec--Functions \
perl-File--Spec--Mac \
perl-File--Spec--OS2 \
perl-File--Spec--Unix \
perl-File--Spec--VMS \
perl-File--Spec--Win32 \
perl-File--Temp \
perl-File--stat \
perl-FileHandle \
perl-Getopt--Long \
perl-Getopt--Long--CallBack \
perl-Getopt--Long--Parser \
perl-Getopt--Std \
perl-IO \
perl-IO--Dir \
perl-IO--File \
perl-IO--Handle \
perl-IO--Pipe \
perl-IO--Pipe--End \
perl-IO--Poll \
perl-IO--Seekable \
perl-IO--Select \
perl-IO--Socket \
perl-IO--Socket--INET \
perl-IO--Socket--UNIX \
perl-IPC--Cmd \
perl-IPC--Open2 \
perl-IPC--Open3 \
perl-List--Util \
perl-List--Util--XS \
perl-POSIX \
perl-POSIX--SigAction \
perl-POSIX--SigRt \
perl-POSIX--SigSet \
perl-Scalar--List--Utils \
perl-Scalar--Util \
perl-SelectSaver \
perl-Socket \
perl-Symbol \
perl-Text--Abbrev \
perl-Text--Balanced \
perl-Text--Balanced--ErrorMsg \
perl-Text--Balanced--Extractor \
perl-Text--ParseWords \
perl-Text--Tabs \
perl-Text--Wrap \
perl-Tie--ExtraHash \
perl-Tie--Hash \
perl-Tie--StdHash \
perl-UNIVERSAL \
perl-XSLoader \
perl-attributes \
perl-base \
perl-builtin \
perl-bytes \
perl-constant \
perl-feature \
perl-fields \
perl-integer \
perl-lib \
perl-locale \
perl-overload \
perl-overloading \
perl-parent \
perl-re \
perl-strict \
perl-utf8 \
perl-vars \
perl-version \
perl-warnings \
perl-warnings--register"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6"

inherit rpm
