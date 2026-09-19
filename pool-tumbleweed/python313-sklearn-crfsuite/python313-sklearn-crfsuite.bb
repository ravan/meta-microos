SUMMARY = "CRFsuite wrapper which provides interface simlar to scikit-learn"
DESCRIPTION = "sklearn-crfsuite is a thin CRFsuite (python-crfsuite) wrapper which provides interface simlar \
to scikit-learn. sklearn_crfsuite.CRF is a scikit-learn compatible estimator: you can use e.g. \
scikit-learn model selection utilities (cross-validation, hyperparameter optimization) with it, \
or save/load CRF models using joblib."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python313-sklearn-crfsuite-0.5.0-1.2.noarch.rpm"
RPM_HASH = "86a11e0c75698300c2bd5f9bdcbb3dfd3cc3c60b9088902f6ca540760e9d7e83c1ddeb3e9e61bb5d53e422ab8f91cf396aa2b5127efbbd820a30d031deddbe38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sklearn-crfsuite \
python3.13dist-sklearn-crfsuite \
python313-sklearn-crfsuite \
python3dist-sklearn-crfsuite"

RDEPENDS:${PN} += "python-abi \
python313-python-crfsuite \
python313-scikit-learn \
python313-tabulate \
python313-tqdm"

inherit rpm
