SUMMARY = "C++ fast alternative to backtracking RE engines"
DESCRIPTION = "RE2 is a C++ library providing a fast, safe, thread-friendly alternative to \
backtracking regular expression engines like those used in PCRE, Perl, and \
Python. \
 \
Backtracking engines are typically full of features and convenient syntactic \
sugar but can be forced into taking exponential amounts of time on even small \
inputs. \
 \
In contrast, RE2 uses automata theory to guarantee that regular expression \
searches run in time linear in the size of the input, at the expense of some \
missing features (e.g. back references and generalized assertions)."
LICENSE = "BSD-3-Clause"

PV = "20251105"

RPM_NAME = "libre2-11-20251105-69.7.aarch64.rpm"
RPM_HASH = "efe8078a32104afa8accf6b6d1c612fed05143b65108dd09ba4293a2695da9289990107fd97e00c511fb97b3a540d60adfd0aea3e18973014242a23554309048"

RPROVIDES:${PN} += "libre2-11 \
libre2.so.11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-spinlock-wait.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
