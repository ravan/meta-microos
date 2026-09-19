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

RPM_NAME = "python313-cachey-0.2.1-3.5.noarch.rpm"
RPM_HASH = "089e69bbc8a1306ad5848ce2ba2389c7d46b3c1a9013b532eb0f0db8c3ffb4666c09ac9b7dd5105ab9c7654c33c736f1db1c2a2fa6a45040772697e422a0e9cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachey \
python3.13dist-cachey \
python313-cachey \
python3dist-cachey"

RDEPENDS:${PN} += "python-abi \
python313-HeapDict"

inherit rpm
