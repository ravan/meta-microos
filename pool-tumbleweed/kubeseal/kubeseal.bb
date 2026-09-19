SUMMARY = "CLI for encrypting secrets to SealedSecrets"
DESCRIPTION = "Problem: 'I can manage all my K8s config in git, except Secrets.' \
 \
Solution: Encrypt your Secret into a SealedSecret, which is safe to store - \
even to a public repository. The SealedSecret can be decrypted only by the \
controller running in the target cluster and nobody else (not even the original \
author) is able to obtain the original Secret from the SealedSecret."
LICENSE = "Apache-2.0"

PV = "0.39.1"

RPM_NAME = "kubeseal-0.39.1-1.1.aarch64.rpm"
RPM_HASH = "b5af76876aafdcc52e6ca7abe773ad342c3524df18fbf4349114cf683045904b72d977f99e4264cff3a971c86b43b8a512c2d8fee1535f4e8f69abb3e036967f"

RPROVIDES:${PN} += "kubeseal"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
