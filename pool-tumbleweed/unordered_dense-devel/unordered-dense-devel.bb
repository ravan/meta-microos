SUMMARY = "Hashmap and hashset based on robin-hood backward shift deletion"
DESCRIPTION = "The provided classes, `ankerl::unordered_dense::map` and \
`ankerl::unordered_dense::set`, are an (almost) drop-in replacements \
for `std::unordered_map` and `std::unordered_set`, respectively. \
While they do not have as strong iterator / reference stability \
guarantees, they are typically faster than libstdc++'s. \
 \
`ankerl::unordered_dense::segmented_map` and \
`ankerl::unordered_dense::segmented_set` are offered. These have \
lower peak memory usage and stable references (but unstable \
iterators) on insert."
LICENSE = "MIT"

PV = "4.8.1"

RPM_NAME = "unordered_dense-devel-4.8.1-1.2.aarch64.rpm"
RPM_HASH = "7f971411c7887a7e820ce0ddc9a5af45923e89b81ab4302fe0c53d2c9e49a1e59192cba198515faee6dcba2afd03b1d6e832e7dd0d1652462ab2de59802673a3"

RPROVIDES:${PN} += "cmake-unordered-dense \
unordered-dense-devel"

RDEPENDS:${PN} += ""

inherit rpm
