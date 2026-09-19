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

RPM_NAME = "python313-unipatch-1.0.0-2.1.noarch.rpm"
RPM_HASH = "c2849b25b5eed087fa52fc2fb54c501319e458d6ddf0a9ce839ef2dc7e377a4657d8d08b7b7fbd08623433df0c3f26d7f340c45c9e4344460466c2a292a55710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unipatch \
python3.13dist-unipatch \
python313-unipatch \
python3dist-unipatch"

RDEPENDS:${PN} += "python-abi"

inherit rpm
