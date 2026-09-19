SUMMARY = "CRFsuite wrapper which provides interface simlar to scikit-learn"
DESCRIPTION = "sklearn-crfsuite is a thin CRFsuite (python-crfsuite) wrapper which provides interface simlar \
to scikit-learn. sklearn_crfsuite.CRF is a scikit-learn compatible estimator: you can use e.g. \
scikit-learn model selection utilities (cross-validation, hyperparameter optimization) with it, \
or save/load CRF models using joblib."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-sklearn-crfsuite-0.5.0-1.2.noarch.rpm"
RPM_HASH = "a78baf434f2ad35ff959c71510e8a1eb839bd48ae4663479f80ce91dce0dfa853e5910318cc2eb37745ed3de4cc7165eecb012a307f23d1d6ffcd556529e7732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sklearn-crfsuite \
python314-sklearn-crfsuite \
python3dist-sklearn-crfsuite"

RDEPENDS:${PN} += "python-abi \
python314-python-crfsuite \
python314-scikit-learn \
python314-tabulate \
python314-tqdm"

inherit rpm
