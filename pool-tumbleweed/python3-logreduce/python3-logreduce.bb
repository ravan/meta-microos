SUMMARY = "Log file anomaly extractor"
DESCRIPTION = "Based on success logs, logreduce highlights useful text in failed logs. \
The goal is to save time in finding a failure's root cause. \
 \
On average, learning run at 2000 lines per second, and \
testing run at 1300 lines per seconds. \
 \
logreduce uses a *model* to learn successful logs and detect novelties in \
failed logs: \
 \
* Random words are manually removed using regular expression \
* Then lines are converted to a matrix of token occurrences \
  (using **HashingVectorizer**), \
* An unsupervised learner implements neighbor searches \
  (using **NearestNeighbors**)."
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "python3-logreduce-0.6.1-4.4.noarch.rpm"
RPM_HASH = "317a03084855c92abcd216e4f0db7bf82acb2ee6a193b9d931799e3ca42aa1a072735fa2666c0895338865d826eb305ac514963e49ef3398f49eb4348475b64f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logreduce \
python3.13dist-logreduce \
python3dist-logreduce"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-aiohttp \
python3-numpy \
python3-requests \
python3-scikit-learn \
python3-scipy"

inherit rpm
