SUMMARY = "Library for manipulating RawFilePaths in a cross platform way"
DESCRIPTION = "This package provides functionality for manipulating 'RawFilePath' values. \
It can be used as a drop in replacement for the filepath library to get the \
benefits of using ByteStrings. It provides three modules: \
 \
* 'System.FilePath.Posix.ByteString' manipulates POSIX/Linux style \
'RawFilePath' values (with '/' as the path separator). \
 \
* 'System.FilePath.Windows.ByteString' manipulates Windows style 'RawFilePath' \
values (with either '\\' or '/' as the path separator, and deals with drives). \
 \
* 'System.FilePath.ByteString' is an alias for the module appropriate to your \
platform. \
 \
All three modules provide the same API, and the same documentation (calling out \
differences in the different variants). \
 \
This package is now deprecated, since filepath 1.4.100.0 provides an OsPath \
type that is based on a bytestring. See \
https://hasufell.github.io/posts/2022-06-29-fixing-haskell-filepaths.html."
LICENSE = "BSD-3-Clause"

PV = "1.5.2.0.5"

RPM_NAME = "ghc-filepath-bytestring-1.5.2.0.5-1.3.aarch64.rpm"
RPM_HASH = "fab673e92e648e7af48d70b2ecdb1ce46e3857aa79f36df40ab989e0ced65e455e2c3ec2bfbbe08302bf94b42ef2dcc0b4d3aa528f9685219557719eb3767dfc"

RPROVIDES:${PN} += "ghc-filepath-bytestring \
libHSfilepath-bytestring-1.5.2.0.5-91PzjYWe6JYJhPT4RGVSOc-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
