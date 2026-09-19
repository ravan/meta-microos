SUMMARY = "Library for creating and modifying zip archives"
DESCRIPTION = "The zip-archive library provides functions for creating, modifying, and \
extracting files from zip archives. The zip archive format is documented in \
<http://www.pkware.com/documents/casestudies/APPNOTE.TXT>. \
 \
Certain simplifying assumptions are made about the zip archives: in particular, \
there is no support for strong encryption, zip files that span multiple disks, \
ZIP64, OS-specific file attributes, or compression methods other than Deflate. \
However, the library should be able to read the most common zip archives, and \
the archives it produces should be readable by all standard unzip programs. \
 \
Archives are built and extracted in memory, so manipulating large zip files \
will consume a lot of memory. If you work with large zip files or need features \
not supported by this library, a better choice may be \
<http://hackage.haskell.org/package/zip zip>, which uses a memory-efficient \
streaming approach. However, zip can only read and write archives inside \
instances of MonadIO, so zip-archive is a better choice if you want to \
manipulate zip archives in 'pure' contexts. \
 \
As an example of the use of the library, a standalone zip archiver and \
extracter is provided in the source distribution."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.2"

RPM_NAME = "ghc-zip-archive-0.4.3.2-2.17.aarch64.rpm"
RPM_HASH = "5181fd781f8ee5aa524569075944c77c3bc14063c810ac0c2680fb113f0d374f401433122b50177022fab1779bb410f7e33bccc91ab9aadae680fb5e15f23b98"

RPROVIDES:${PN} += "ghc-zip-archive \
libHSzip-archive-0.4.3.2-7LOPKgQ3Ei9AA5FjkJE7vc-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSdigest-0.0.2.1-KdJahDzYM113RUTsWm7UXN-ghc9.12.4.so \
libHSdirectory-1.3.10.1-b1d7-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfile-io-0.1.6-8374-ghc9.12.4.so \
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
libHStext-2.1.4-cf23-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libHSzlib-0.7.1.1-9wvDfX7JlnE99sTdZLYOpU-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libz.so.1"

inherit rpm
