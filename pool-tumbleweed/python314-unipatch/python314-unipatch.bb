SUMMARY = "Apply unified diffs in memory, compatible with GNU patch"
DESCRIPTION = "Apply unified diffs in memory, compatible with GNU patch. \
 \
unipatch follows the behaviour of the GNU ``patch`` commandline utility, verified by differentially testing against it with randomized inputs: \
 \
* Hunks may apply at an *offset* from the line numbers stated in their ``@@`` headers, matching by content, with a found offset carrying forward to later hunks. \
 \
* A *fuzz factor* ignores up to two mismatching context lines at the edges of a hunk. Ignored context lines are left as they are in the source. \
  A hunk with less context on one side, as ``diff`` produces at the start or end of a file, only applies at that edge of the source. \
 \
* Oddities are tolerated like GNU ``patch``: \
 \
  * Hunks cut short at the end of the patch \
  * Context lines that have lost their leading space (empty and tab-led lines) \
  * ``\\ No newline at end of file`` markers \
 \
Only unified diff format is supported, not the older context or ``ed`` formats. \
Hence the name is ``unipatch``."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-unipatch-1.0.0-2.1.noarch.rpm"
RPM_HASH = "1c6cf1f11d6d1710bece2551d63ecbf574d5d26834b6da08bd51ca06e708c89793968d5060d45c5473c9cbe8c6201019f8dfc16ba3b77bbdb87bdab1f65f552c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-unipatch \
python314-unipatch \
python3dist-unipatch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
