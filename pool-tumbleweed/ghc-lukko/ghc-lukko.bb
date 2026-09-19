SUMMARY = "File locking"
DESCRIPTION = "This package provides access to platform dependent file locking APIs: \
 \
* \
<https://www.gnu.org/software/libc/manual/html_node/Open-File-Description-Locks.html \
Open file descriptor locking> on Linux ('Lukko.OFD') * BSD-style 'flock(2)' \
locks on UNIX platforms ('Lukko.FLock') * Windows locking via \
<https://docs.microsoft.com/en-us/windows/win32/api/fileapi/nf-fileapi-lockfilee \
LockFileEx> ('Lukko.Windows') * No-op locking, which throws exceptions \
('Lukko.NoOp') * 'Lukko' module exports the best option for the target platform \
with uniform API. \
 \
There are alternative file locking packages: \
 \
* 'GHC.IO.Handle.Lock' in 'base >= 4.10' is good enough for most use cases. \
However, uses only 'Handle's so these locks cannot be used for intra-process \
locking. (You should use e.g. 'MVar' in addition). \
 \
* <https://hackage.haskell.org/package/filelock filelock> doesn't support OFD \
locking. \
 \
/Lukko/ means lock in Finnish. \
 \
Submodules 'Lukko.OFD', 'Lukko.Windows' etc are available based on following \
conditions. \
 \
' if os(windows) cpp-options: -DHAS_WINDOWS_LOCK \
 \
elif (os(linux) && flag(ofd-locking)) cpp-options: -DHAS_OFD_LOCKING \
cpp-options: -DHAS_FLOCK \
 \
elif !(os(solaris) || os(aix)) cpp-options: -DHAS_FLOCK ' \
 \
'Lukko.FLock' is available on not (Windows or Solaris or AIX). \
'Lukko.NoOp' is always available."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-lukko-0.1.2-2.14.aarch64.rpm"
RPM_HASH = "ef37600f6ed95fe50d172b9f513f0a2a2bc552e89308f6449f952e2ebd3cdecf31d4c412f55b25c72e06e97d739cbd5fe5f4999e138c76f14966f8f751d4f834"

RPROVIDES:${PN} += "ghc-lukko \
libHSlukko-0.1.2-KyYOwE0CZU8A6c79eyT2Xk-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
