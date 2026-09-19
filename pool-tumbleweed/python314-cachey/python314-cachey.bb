SUMMARY = "A Python cache mindful of computation/storage costs"
DESCRIPTION = "Cachey tries to hold on to values that have the following characteristics \
 \
1. Expensive to recompute (in seconds) \
2. Cheap to store (in bytes) \
3. Frequently used \
4. Recenty used \
 \
It accomplishes this by adding the following to each items score on each access \
 \
    score += compute_time / num_bytes * (1 + eps) ** tick_time \
 \
For some small value of epsilon (which determines the memory halflife). This \
has units of inverse bandwidth, has exponential decay of old results and \
roughly linear amplification of repeated results."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python314-cachey-0.2.1-3.5.noarch.rpm"
RPM_HASH = "286a459c6c4a44ef1c71c1e7575945af32adbe76238d104a0d5cc7469d53fc0713b9442545d9ef6b80b2844f642daf5f6138f1b3cd68be8c82bf962f38ba35db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cachey \
python314-cachey \
python3dist-cachey"

RDEPENDS:${PN} += "python-abi \
python314-HeapDict"

inherit rpm
